USE [atzoum01]
GO

/****** Object:  StoredProcedure [dbo].[avgage]    Script Date: 27/11/2020 21:30:15 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[avgage]
AS
 SELECT AVG(Datediff("yyyy",[PROFILE].[birthday],getdate())) as AVG_AGE
 FROM [dbo].[PROFILE] 
GO

/****** Object:  StoredProcedure [dbo].[countsphotosalbum]    Script Date: 27/11/2020 21:30:15 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[countsphotosalbum]
@album_id [int]
AS
 SELECT COUNT([photo_id])
 FROM [dbo].[CONTAINS] AS C
 WHERE [C].[album_id]= @album_id
GO

/****** Object:  StoredProcedure [dbo].[friendsbigalbum]    Script Date: 27/11/2020 21:30:15 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[friendsbigalbum]
@N [int]
AS
 SELECT COUNT([AL].album_id), [P].name  
 FROM [dbo].[FRIENDS] AS F, [dbo].[PROFILE] AS P , [dbo].[ALBUM] AS AL
 WHERE [AL].album_id > @N and [P].profile_id = profile_2 or profile_1 = [P].profile_id
 GROUP BY name
 
GO

/****** Object:  StoredProcedure [dbo].[insertrecord]    Script Date: 27/11/2020 21:30:16 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[insertrecord]
@LastName nvarchar(20), @FirstName  nvarchar(20) , @Birthday [smalldatetime], @Gender [char](1), @Email [nvarchar](50) , @Password [nvarchar](50)
AS
 INSERT INTO [dbo].[PROFILE] ( first_name, last_name, birthday, gender, email, password)
 VALUES ( @FirstName , @LastName , @Birthday , @Gender , @Email, @Password)
GO

/****** Object:  StoredProcedure [dbo].[leastfamousevents]    Script Date: 27/11/2020 21:30:16 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[leastfamousevents]
AS
 SELECT MIN(counters)
 FROM (SELECT COUNT([ER].[profile_id]) AS counters , event_name, owner_id
 FROM [dbo].[EVENTS] AS E, [dbo].[EVENT_RESPONSES] AS ER , [dbo].[PROFILE] AS PROFILE
 WHERE [E].[event_id] = [ER].event_id AND [E].owner_id = [PROFILE].profile_id
 GROUP BY event_name,owner_id)t


GO

/****** Object:  StoredProcedure [dbo].[sameinsterests]    Script Date: 27/11/2020 21:30:16 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[sameinsterests]
AS
 SELECT profile_id,interest_id, interest_name
 FROM [dbo].[INTERESTS] AS INTEREST, [dbo].[PROFILE] AS P
 WHERE interest_id = interest_id AND profile_id!=profile_id
GO

/****** Object:  StoredProcedure [dbo].[searchalbum]    Script Date: 27/11/2020 21:30:16 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[searchalbum]
@name [sysname]
AS
 SELECT album_name, album_id
 FROM [dbo].[ALBUM] AS AL
 WHERE [AL].[album_name] LIKE @name + '%'
GO

/****** Object:  StoredProcedure [dbo].[searchevents]    Script Date: 27/11/2020 21:30:16 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[searchevents]
@event_name [sysname]
AS
 SELECT event_name, event_id
 FROM [dbo].[EVENTS] AS EV
 WHERE [EV].[event_name] LIKE @event_name + '%'
GO

/****** Object:  StoredProcedure [dbo].[searchlink]    Script Date: 27/11/2020 21:30:16 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[searchlink]
@link [sysname]
AS
 SELECT link, link_id
 FROM [dbo].[LINKS] AS LINKS
 WHERE [LINKS].[link] LIKE @link + '%'
GO

/****** Object:  StoredProcedure [dbo].[searchphoto]    Script Date: 27/11/2020 21:30:16 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[searchphoto]
@photo_id [int]
AS
 SELECT photo_id
 FROM [dbo].[PHOTOS] AS PH
 WHERE [PH].[photo_id] LIKE @photo_id + '%'
GO

/****** Object:  StoredProcedure [dbo].[searchvideo]    Script Date: 27/11/2020 21:30:16 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[searchvideo]
@message [sysname]
AS
 SELECT message, video_id
 FROM [dbo].[VIDEO] AS V
 WHERE [V].[message] LIKE @message + '%'
GO

/****** Object:  StoredProcedure [dbo].[showalbum]    Script Date: 27/11/2020 21:30:16 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[showalbum]
@album_id [int]
AS
 SELECT album_id, album_name , privacy , description , [CITY].name , [PROFILE].name
 FROM [dbo].[ALBUM] AS AL, [dbo].[CITY] AS CITY , [dbo].[PROFILE] AS PROFILE
 WHERE album_id = @album_id AND [AL].[city_id] = [CITY].city_id AND [AL].profile_id = [PROFILE].profile_id

GO

/****** Object:  StoredProcedure [dbo].[showevents]    Script Date: 27/11/2020 21:30:16 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[showevents]
@event_id [int]
AS
 SELECT event_id, event_name, privacy ,start_time , end_time, description, [CITY].name , [PROFILE].name
 FROM [dbo].[EVENTS] AS E, [dbo].[CITY] AS CITY , [dbo].[PROFILE] AS PROFILE
 WHERE event_id = @event_id AND [E].[venue] = [CITY].city_id AND [E].owner_id = [PROFILE].profile_id

GO

/****** Object:  StoredProcedure [dbo].[showinsterests]    Script Date: 27/11/2020 21:30:17 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[showinsterests]
@insterest_id [int]
AS
 SELECT interest_id, interest_name
 FROM [dbo].[INTERESTS] AS INTEREST
 WHERE interest_id = @insterest_id 
GO

/****** Object:  StoredProcedure [dbo].[showlikes]    Script Date: 27/11/2020 21:30:17 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[showlikes]
@video_id [int]
AS
 SELECT @video_id, [PROFILE].name
 FROM [dbo].[LIKES] AS L, [dbo].[PROFILE] AS PROFILE
 WHERE @video_id = @video_id AND [L].profile_id = [PROFILE].profile_id

GO

/****** Object:  StoredProcedure [dbo].[showlink]    Script Date: 27/11/2020 21:30:17 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[showlink]
@link_id [int]
AS
 SELECT link_id, link , [L].[name], caption, description, message , [PROFILE].[name]
 FROM [dbo].[LINKS] AS L,  [dbo].[PROFILE] AS PROFILE
 WHERE link_id= @link_id AND [L].[from_user] = [PROFILE].profile_id 

GO

/****** Object:  StoredProcedure [dbo].[showphoto]    Script Date: 27/11/2020 21:30:17 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[showphoto]
@photo_id [int]
AS
 SELECT photo_id, height , width , source , [AL].album_id , [PROFILE].[name]
 FROM [dbo].[ALBUM] AS AL, [dbo].[PHOTOS] AS PH , [dbo].[PROFILE] AS PROFILE
 WHERE photo_id = @photo_id AND [PH].[from_user] = [PROFILE].profile_id AND [PH].album_id = [AL].[album_id]
GO

/****** Object:  StoredProcedure [dbo].[showprofile]    Script Date: 27/11/2020 21:30:17 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[showprofile]
@id [int]
AS
 SELECT last_name, first_name , [PROFILE].[name], birthday, website, email, [BORN].[name], [LIVES].[name], gender
 FROM [dbo].[PROFILE] , [dbo].[CITY] AS BORN , [dbo].[CITY] AS LIVES
 WHERE profile_id = @id AND [PROFILE].born_at = [BORN].city_id AND [PROFILE].lives_in = [LIVES].city_id
GO

/****** Object:  StoredProcedure [dbo].[showvideo]    Script Date: 27/11/2020 21:30:17 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE [dbo].[showvideo]
@video_id [int]
AS
 SELECT video_id, message , video, description , [PROFILE].[name]
 FROM [dbo].[VIDEO] AS V,  [dbo].[PROFILE] AS PROFILE
 WHERE video_id= @video_id AND [V].[profile_id] = [PROFILE].profile_id 

GO

/****** Object:  StoredProcedure [dbo].[checkLogin]    Script Date: 11/27/2020 11:08:36 PM ******/
/** returns the user's id if it's a match or NULL otherwise **/
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


