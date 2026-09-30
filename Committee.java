public class Committee
{
    private String name;
    private Member[] members;
    private int count;
    
    public Committee(String name, Member[] members, int count) {
        this.name = name;
        this.members = new Member[members.length];
        this.count = count;
        for(int i = 0; i<members.length; i++)
        {
            this.members[i] = members[i];
        }
    }

    public String getName() {
        return name;
    }

    public Member[] getMembers() {
        return members;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMembers(Member[] members) {
        this.members = members;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public int total(boolean belong)
    {
        int totalCount = 0;
        for(int i = 0; i<count; i++)
        {
            if(members[i].isCoal() == belong)
            {
                totalCount++;
            }
        }
        return  totalCount;
    }
    
}