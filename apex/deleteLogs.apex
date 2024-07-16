List<ApexLog> logs = [select id, starttime, loguserid, loguser.name, loglength, location from ApexLog where location='SystemLog' and  LogUser.Name='Bill Murphy' order by loglength desc, starttime asc];

