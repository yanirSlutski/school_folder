public class Member
{
    private String name;
    private boolean isCoal;

    public Member(String name, boolean isCoal)
    {
        this.name = name;
        this.isCoal = isCoal;
    }

    public String getName() {
        return name;
    }

    public boolean isCoal() {
        return isCoal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoal(boolean isCoal) {
        this.isCoal = isCoal;
    }

    
}
