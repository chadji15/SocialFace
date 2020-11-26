import pyodbc

driver = "{ODBC Driver 17 for SQL Server}"
server = "APOLLO"
database = "chadji15"
uid = "chadji15"
pwd = "RdjUFL3z"
con_string = f"DRIVER={driver};SERVER={server};DATABASE={database};UID={uid};PWD={pwd}"
conn = pyodbc.connect(con_string)

values = {}
