USE [chadji15]
GO
/****** Object:  UserDefinedFunction [dbo].[haveCommonFriends]    Script Date: 11/29/2020 6:41:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date, ,>
-- Description:	<Description, ,>
-- =============================================
CREATE FUNCTION [dbo].[haveCommonFriends]
(
	@user_id int, @fid int
)
RETURNS bit
AS
BEGIN
	-- Declare the return variable here
	DECLARE @ret bit

	IF EXISTS(
		SELECT profile_2 FROM dbo.FRIENDS WHERE profile_1 = @user_id
		EXCEPT
		SELECT profile_2 FROM dbo.FRIENDS WHERE profile_2 = @fid
	)
		SET @ret = 0
	ELSE
		SET @ret = 1
	-- Return the result of the function
	RETURN @ret

END
GO
/****** Object:  UserDefinedFunction [dbo].[sameInterests]    Script Date: 11/29/2020 6:41:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date, ,>
-- Description:	<Description, ,>
-- =============================================
CREATE FUNCTION [dbo].[sameInterests]
(
	@id1 int, @id2 int
)
RETURNS bit
AS
BEGIN
	-- Declare the return variable here
	DECLARE @ret bit

	IF EXISTS(SELECT * FROM (SELECT interest_id FROM [TABLES] WHERE profile_id = @id1) AS A
			UNION 
			SELECT * FROM (SELECT interest_id FROM [TABLES] WHERE profile_id = @id2) AS B
			EXCEPT 
			SELECT * FROM (SELECT interest_id FROM [TABLES] WHERE profile_id = @id1) AS A
			INTERSECT
			SELECT * FROM (SELECT interest_id FROM [TABLES] WHERE profile_id = @id2) AS B)
		SET @ret = 0
	ELSE
		SET @ret = 1

	-- Return the result of the function
	RETURN @ret

END
GO
/****** Object:  StoredProcedure [dbo].[checkLogin]    Script Date: 11/29/2020 6:41:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[checkLogin]
	-- Add the parameters for the stored procedure here
	@email sysname, @password sysname, @id INT OUTPUT
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    SET @id = (
		SELECT profile_id
		FROM [dbo].[PROFILE]
		WHERE email = @email AND @password = password
		)

END
GO
/****** Object:  StoredProcedure [dbo].[commonFriends]    Script Date: 11/29/2020 6:41:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[commonFriends]
	-- Add the parameters for the stored procedure here
	@id int
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT P.profile_id, P.[name]
	FROM dbo.FRIENDS AS F, dbo.[PROFILE] AS P
	WHERE F.profile_1 = @id AND dbo.haveCommonFriends(@id, F.profile_2) = 1 AND P.profile_id = F.profile_2
END
GO
/****** Object:  StoredProcedure [dbo].[friendsWithSameInterest]    Script Date: 11/29/2020 6:41:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[friendsWithSameInterest]
	-- Add the parameters for the stored procedure here
	@id int
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    -- Insert statements for procedure here
	SELECT P.profile_id, P.[name]
	FROM 
	(SELECT F.profile_2
	FROM dbo.FRIENDS AS F
	WHERE F.profile_1 = @id AND [dbo].[sameInterests](F.profile_1, F.profile_2) = 1) as T,
	dbo.[PROFILE] as P
	WHERE T.profile_2 = P.profile_id
END
GO
/****** Object:  StoredProcedure [dbo].[getUpdatesAlbum]    Script Date: 11/29/2020 6:41:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[getUpdatesAlbum]
	-- Add the parameters for the stored procedure here
	@id int, @n int
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    SELECT TOP (@n) album_id, album_name
	FROM dbo.ALBUM
	WHERE update_date IS NOT NULL
	ORDER BY update_date DESC
END
GO
/****** Object:  StoredProcedure [dbo].[getUpdatesAll]    Script Date: 11/29/2020 6:41:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[getUpdatesAll]
	-- Add the parameters for the stored procedure here
	@id int, @n int
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

	DECLARE @temp TABLE (
		[name] varchar(100),
		update_date datetime2
	);

	INSERT INTO @temp
	SELECT top(@n) [album_name], update_date
	from dbo.ALBUM
	where update_date is not null
	order by update_date desc

	INSERT INTO @temp
	SELECT top(@n) [photo_name], update_date
	from dbo.PHOTOS
	where update_date is not null
	order by update_date desc

	INSERT INTO @temp
	SELECT top(@n) [message], update_date
	from dbo.VIDEO
	where update_date is not null
	order by update_date desc

	INSERT INTO @temp
	SELECT top(@n) [name], update_date
	from dbo.LINKS
	where update_date is not null
	order by update_date desc

	INSERT INTO @temp
	SELECT top(@n) event_name, update_date
	from dbo.[EVENTS]
	where update_date is not null
	order by update_date desc

	select top(@n) [name]
	from @temp
	order by update_date desc

END
GO
/****** Object:  StoredProcedure [dbo].[getUpdatesEvents]    Script Date: 11/29/2020 6:41:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[getUpdatesEvents]
	-- Add the parameters for the stored procedure here
	@id int, @n int
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    SELECT TOP(@n) event_id, event_name
	FROM  dbo.[EVENTS]
	WHERE update_date is not null
	order by update_date desc
END
GO
/****** Object:  StoredProcedure [dbo].[getUpdatesLinks]    Script Date: 11/29/2020 6:41:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[getUpdatesLinks]
	-- Add the parameters for the stored procedure here
	@id int, @n int
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    SELECT TOP(@n) link_id, [name]
	FROM  dbo.LINKS
	WHERE update_date is not null
	order by update_date desc
END
GO
/****** Object:  StoredProcedure [dbo].[getUpdatesPhotos]    Script Date: 11/29/2020 6:41:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[getUpdatesPhotos]
	-- Add the parameters for the stored procedure here
	@id int, @n int
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    SELECT TOP(@n) photo_id, photo_name
	FROM  dbo.photos
	WHERE update_date is not null
	order by update_date desc
END
GO
/****** Object:  StoredProcedure [dbo].[getUpdatesVideos]    Script Date: 11/29/2020 6:41:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[getUpdatesVideos]
	-- Add the parameters for the stored procedure here
	@id int, @n int
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

    SELECT TOP(@n) video_id, [message]
	FROM  dbo.VIDEO
	WHERE update_date is not null
	order by update_date desc
END
GO
/****** Object:  StoredProcedure [dbo].[mostPopularFriends]    Script Date: 11/29/2020 6:41:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[mostPopularFriends]
	-- Add the parameters for the stored procedure here
	@id int
AS
BEGIN
	-- SET NOCOUNT ON added to prevent extra result sets from
	-- interfering with SELECT statements.
	SET NOCOUNT ON;

	SELECT P.profile_id, P.[name]
	FROM(
   SELECT TOP 10 F1.profile_2
   FROM dbo.FRIENDS AS F1, dbo.FRIENDS as F2, dbo.[PROFILE] AS P
   WHERE F1.profile_1 = @id AND (F1.profile_2 = F2.profile_1) AND F2.profile_2 = P.profile_id
   GROUP BY F1.profile_2
   ORDER BY COUNT(CASE P.verified when 1 then 1 else null end) DESC
   ) AS T,
   dbo.[PROFILE] as P
   WHERE T.profile_2 = P.profile_id
END
GO
