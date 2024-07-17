class Sports{

static String iplTeams[]={"DC","CSK","KKR","PBKS","LSG","MI","GT","RR","SRH","RCB"};
static String top10BatsManOdis[]={"Babar Azam","Shubman Gill","Virat Kohli","Rohit Sharma","Harry Tector","Daryl Mitchell","David Warner","Pathum Nissanka","Dawid Malan","Rassie Van Der Dussen"};
static String top10BowlersOdis[]={"Keshav Maharaj","Josh hazlewood","Adam Zampa","Mohammed Siraj","Jasprit Bumrah","Mohammad Nabi","Shaheen Afridi","Kuldeep Yadav","Trent Boult","Bernard Scholtz"};
static String top10ICCTeamNames[]={"IND","AUS","SA","PAK","NZ","ENG","SL","BAN","AFG","WI"};
public static void main(String []Sports ){

  System.out.println("IPL TEAMS are ");
  for(int index = 0; index < iplTeams.length; index++){
  System.out.println(iplTeams[index]);
  }
  System.out.println("Top 10 Batsman in ODI ");
  for(int index = 0; index < top10BatsManOdis.length; index++){
	System.out.println(top10BatsManOdis[index]);
  }	
  System.out.println("Top 10 Bowlwers in ODI");//n"+top10BowlersOdis[0]+"\n" +top10BowlersOdis[1]+"\n"+top10BowlersOdis[2]+"\n"+top10BowlersOdis[3]+"\n"+top10BowlersOdis[4]+"\n"+top10BowlersOdis[5]+"\n"+top10BowlersOdis[6]+"\n"+top10BowlersOdis[7]+"\n"+top10BowlersOdis[8]+"\n"+top10BowlersOdis[9]+"\n");
for(int index = 0;index < top10BowlersOdis.length; index++){
	System.out.println(top10BowlersOdis[index]);
}
  System.out.println("Top 10 ICC Team Names in ODI ");//n"+top10ICCTeamNames[0]+"\n" +top10ICCTeamNames[1]+"\n"+top10ICCTeamNames[2]+"\n"+top10ICCTeamNames[3]+"\n"+top10ICCTeamNames[4]+"\n"+top10ICCTeamNames[5]+"\n"+top10ICCTeamNames[6]+"\n"+top10ICCTeamNames[7]+"\n"+top10ICCTeamNames[8]+"\n"+top10ICCTeamNames[9]+"\n");
for(int index = 0;index < top10ICCTeamNames.length;index++){
	System.out.println(top10ICCTeamNames[index]);
}
 
 
 }
 }