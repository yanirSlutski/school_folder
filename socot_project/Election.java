
public class Election {
	private Yellow[] results;
	private int numCandid;
	
	
	public boolean isIlleagal(Yellow y)
	{
		if(y.getNumNotes() > 1 || y.getCandid > numCandid || y.getCandid < 1)
		{
			return false;
		}
		return true;
	}
	
	public boolean needRound2() {
		int winner = 0;
		int winnerAmount = 0;
		int totalVotes = 0;
		int[] candidVotes = new int[numCandid];
		
		// sort how many leagal votes each candid got
		for(int i = 0; i < results.length; i++)
		{
			if(!isIlleagal(results[i]))
			{
				candidVotes[results[i].getCanadid() - 1]++;
				totalVotes++;
			}
		}
		
		for(int i = 0; i < results.length; i++)
		{
			if(candidVotes[i] > winnerAmount)
			{
				winner = i;
				winnerAmount = candidVotes[i];
			}
		}
		
		if(winnerAmount/(double)totalVotes > 0.4)
		{
			return true;
		}
		
		return false;
	}
	
}
