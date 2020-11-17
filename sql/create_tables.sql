CREATE TABLE [dbo].[PROFILE](
[profile_id] [int] NOT NULL,
[last_name] [nvarchar](20) NOT NULL,
[first_name] [nvarchar](20) NOT NULL,
[birthday] [smalldatetime] NOT NULL,
[quotes] [nvarchar](200) NULL,
[website] [nvarchar](50) NULL,
[email] [nvarchar](50) NOT NULL,
[password] [nvarchar] (50) NOT NULL UNIQUE,
[born_at] [nvarchar](50) NULL,
[lives_at] [nvarchar](50) NULL
CONSTRAINT PK_PROFILE PRIMARY KEY
([profile_id] ASC)
)

CREATE TABLE [dbo].[CITY](
[city_id] [int] NOT NULL,
[name] nvarchar (50) NOT NULL
CONSTRAINT PK_CITY PRIMARY KEY
([city_id] ASC)
)

CREATE TABLE [dbo].[ALBUM](
[album_id] [int] NOT NULL,
[album_name] [nvarchar] (20) NOT NULL,
[privacy] 
[description] nvarchar(100) NULL
[city_id] [int] NOT NULL,
[profile_id] [int] NOT NULL
CONSTRAINT PK_ALBUM PRIMARY KEY
([album_id] ASC)
)

CREATE TABLE [dbo].[SCHOOLS]
[school_id] [int] NOT NULL,
[school_name [nvarchar] (50) NOT NULL
CONSTRAINT PK_SCHOOLS PRIMARY KEY
([school_id] ACS)
)

CREATE TABLE [dbo].[COMPANY]
[company_id] [int] NOT NULL,
[company_name [nvarchar] (50) NOT NULL
CONSTRAINT PK_COMPANY PRIMARY KEY
([company_id] ACS)
)

CREATE TABLE [dbo].[INTERESTS]
[interest_id] [int] NOT NULL,
[interest_name [nvarchar] (50) NOT NULL
CONSTANT PK_INTERESTS PRIMARY KEY
([interest_id] ACS)
)

CREATE TABLE [dbo].[VIDEO](
[video_id] [int] NOT NULL,
[message] [nvarchar](100) NULL,
[video]
[description] [nvarchar](100) NULL,
[profile_id] [int] NOT NULL
CONSTRAINT PK_VIDEO PRIMARY KEY
([video_id] ASC)
)

CREATE TABLE [dbo].[EVENTS](
[event_id] [int] NOT NULL,
[event_name] [nvarchar] (20) NOT NULL,
[privacy]
[location] [nvarchar] (20) NULL,
[start_time] [timestamp] 'HH24:MI:SS',
[end_time] [timestamp] 'HH24:MI:SS',
[description] [nvarchar] (100) NULL,
[owner_id] [int] NOT NULL,
[venue] [nvarchar] (20) NULL
CONSTRAINT PK_EVENTS PRIMARY KEY
([event_id] ACS)
)

CREATE TABLE [dbo].[LINKS](
[link_id] [int] NOT NULL,
[name] [nvarchar] (20) NOT NULL,
[caption] [nvarchar] (50) NULL,
[description] [nvarchar] (100) NULL,
[message] [nvarchar](100) NULL,
[from] [nvarchar] (20) NULL
CONSTRAINT PK_LINKS PRIMARY KEY
([link_id] ACS)
)

CREATE TABLE [dbo].[STUDIED_AT](
[school_id] [int] NOT NULL,
[profile_id] [int] NOT NULL
)

CREATE TABLE [dbo].[WORKED_FOR](
[profile_id] [int] NOT NULL,
[company_id] [int] NOT NULL
)

CREATE TABLE [dbo].[TABLE](
[interest_id] [int] NOT NULL,
[profile_id] [int] NOT NULL
)
CREATE TABLE [dbo].[VIDEO_COMMENTS](
[video_id] [int] NOT NULL,
[profile_id] [int] NOT NULL,
[comment] nvarchar (50) NULL
)
CREATE TABLE [dbo].[EVENT_RESPONSES](
[event_id] [int] NOT NULL,
[profile_id] [int] NOT NULL,
[response] nvarchar (50) NULL
)
CREATE TABLE [dbo].[LIKES](
[photo_id] [int] NOT NULL,
[profile_id] [int] NOT NULL
)
CREATE TABLE [dbo].[REQUESTS](
[profile_1] [int] NOT NULL,
[profile_2] [int] NOT NULL,
[state] [nvarchar] NULL
)
CREATE TABLE [dbo].[FRIENDS](
[profile_1] [int] NOT NULL,
[profile_2] [int] NOT NULL
)
CREATE TABLE [dbo].[ALBUM_COMMENTS](
[album_id] [int] NOT NULL,
[profile_id] [int] NOT NULL,
[comment] nvarchar (50) NULL
)

--CREATE FOREIGN KEY CONSTRAINTS
ALTER TABLE [dbo].[PROFILE]  WITH CHECK ADD  CONSTRAINT [FK_PROFILE_CITY] FOREIGN KEY([born_at])
REFERENCES [dbo].[CITY] ([city_id])
GO
ALTER TABLE [dbo].[PROFILE]  WITH CHECK ADD  CONSTRAINT [FK_PROFILE_CITY] FOREIGN KEY([lives_at])
REFERENCES [dbo].[CITY] ([city_id])
GO
ALTER TABLE [dbo].[ALBUM]  WITH CHECK ADD  CONSTRAINT [FK_ALBUM_CITY] FOREIGN KEY([city_id])
REFERENCES [dbo].[CITY] ([city_id])
GO
ALTER TABLE [dbo].[ALBUM]  WITH CHECK ADD  CONSTRAINT [FK_ALBUM_PROFILE] FOREIGN KEY([profile_id])
REFERENCES [dbo].[PROFILE] ([profile_id])
GO
ALTER TABLE [dbo].[VIDEO]  WITH CHECK ADD  CONSTRAINT [FK_VIDEO_PROFILE] FOREIGN KEY([profile_id])
REFERENCES [dbo].[PROFILE] ([profile_id])
GO
ALTER TABLE [dbo].[EVENTS]  WITH CHECK ADD  CONSTRAINT [FK_EVENTS_PROFILE] FOREIGN KEY([owner_id])
REFERENCES [dbo].[PROFILE] ([profile_id])
GO
ALTER TABLE [dbo].[EVENTS]  WITH CHECK ADD  CONSTRAINT [FK_EVENTS_PROFILE] FOREIGN KEY([venue])
REFERENCES [dbo].[PROFILE] ([profile_id])
GO
ALTER TABLE [dbo].[LINKS]  WITH CHECK ADD  CONSTRAINT [FK_LINKS_PROFILE] FOREIGN KEY([from])
REFERENCES [dbo].[P] ([profile_id])
GO
ALTER TABLE [dbo].[STUDIED_AT]  WITH CHECK ADD  CONSTRAINT [FK_STUDIED_AT_SCHOOLS] FOREIGN KEY([school_id])
REFERENCES [dbo].[SCHOOLS] ([school_id])
GO
ALTER TABLE [dbo].[STUDIED_AT]  WITH CHECK ADD  CONSTRAINT [FK_STUDIED_AT_PROFILE] FOREIGN KEY([profile_id])
REFERENCES [dbo].[PROFILE] ([profile_id])
GO
ALTER TABLE [dbo].[WORKED_FOR]  WITH CHECK ADD  CONSTRAINT [FK_WORKED_FOR_PROFILE] FOREIGN KEY([profile_id])
REFERENCES [dbo].[PROFILE] ([profile_id])
GO
ALTER TABLE [dbo].[WORKED_FOR]  WITH CHECK ADD  CONSTRAINT [FK_WORKED_FOR_COMPANY] FOREIGN KEY([company_id])
REFERENCES [dbo].[COMPANY] ([company_id])
GO
ALTER TABLE [dbo].[TABLE]  WITH CHECK ADD  CONSTRAINT [FK_TABLE_INTERESTS] FOREIGN KEY([interest_id])
REFERENCES [dbo].[INTERESTS] ([interest_id])
GO
ALTER TABLE [dbo].[TABLE]  WITH CHECK ADD  CONSTRAINT [FK_TABLE_PROFILE] FOREIGN KEY([profile_id])
REFERENCES [dbo].[PROFILE] ([profile_id])
GO
ALTER TABLE [dbo].[VIDEO_COMMENTS]  WITH CHECK ADD  CONSTRAINT [FK_VIDEO_COMMENTS_VIDEO] FOREIGN KEY([video_id])
REFERENCES [dbo].[VIDEO] ([video_id])
GO
ALTER TABLE [dbo].[VIDEO_COMMENTS]  WITH CHECK ADD  CONSTRAINT [FK_TABLE_PROFILE] FOREIGN KEY([profile_id])
REFERENCES [dbo].[PROFILE] ([profile_id])
GO
ALTER TABLE [dbo].[EVENT_RESPONSES]  WITH CHECK ADD  CONSTRAINT [FK_EVENT_RESPONSES_EVENTS] FOREIGN KEY([event_id])
REFERENCES [dbo].[EVENTS] ([event_id])
GO
ALTER TABLE [dbo].[EVENT_RESPONSES]  WITH CHECK ADD  CONSTRAINT [FK_EVENT_RESPONSES_PROFILE] FOREIGN KEY([profile_id])
REFERENCES [dbo].[PROFILE] ([profile_id])
GO
ALTER TABLE [dbo].[LIKES]  WITH CHECK ADD  CONSTRAINT [FK_LIKES_PHOTOS] FOREIGN KEY([photo_id])
REFERENCES [dbo].[PHOTOS] ([photo_id])
GO
ALTER TABLE [dbo].[LIKES]  WITH CHECK ADD  CONSTRAINT [FK_LIKES_PROFILE] FOREIGN KEY([profile_id])
REFERENCES [dbo].[PROFILE] ([profile_id])
GO
ALTER TABLE [dbo].[REQUESTS]  WITH CHECK ADD  CONSTRAINT [FK_REQUESTS_PROFILE] FOREIGN KEY([profile_1])
REFERENCES [dbo].[PROFILE] ([profile_id])
GO
ALTER TABLE [dbo].[REQUESTS]  WITH CHECK ADD  CONSTRAINT [FK_REQUESTS_PROFILE] FOREIGN KEY([profile_2])
REFERENCES [dbo].[PROFILE] ([profile_id])
GO
ALTER TABLE [dbo].[FRIENDS]  WITH CHECK ADD  CONSTRAINT [FK_FRIENDS_PROFILE] FOREIGN KEY([profile_1])
REFERENCES [dbo].[PROFILE] ([profile_id])
GO
ALTER TABLE [dbo].[FRIENDS]  WITH CHECK ADD  CONSTRAINT [FK_FRIENDS_PROFILE] FOREIGN KEY([profile_2])
REFERENCES [dbo].[PROFILE] ([profile_id])
GO
ALTER TABLE [dbo].[ALBUM_COMMENTS]  WITH CHECK ADD  CONSTRAINT [FK_ALBUM_COMMENTS_ALBUM] FOREIGN KEY([album_id])
REFERENCES [dbo].[ALBUM] ([album_id])
GO
ALTER TABLE [dbo].[ALBUM_COMMENTS]  WITH CHECK ADD  CONSTRAINT [FK_ALBUM_COMMENTS_PROFILE] FOREIGN KEY([profile_id])
REFERENCES [dbo].[PROFILE] ([profile_id])

