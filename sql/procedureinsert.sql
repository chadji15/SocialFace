CREATE PROCEDURE insertrecord
@LastName nvarchar(20), @FirstName  nvarchar(20) , @Birthday [smalldatetime], @Gender [char](1), @Email [nvarchar](50) , @Password [nvarchar](50)
AS
 INSERT INTO [atzoum01].[PROFILE] (profile_id, first_name, last_name, birthday, email, password)
 VALUES (@@IDENTITY , @FirstName , @LastName , @Birthday, @Email, @Password)