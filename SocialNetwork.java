public class SocialNetwork {

    private User[] users;

    public SocialNetwork(User[] users) {
        this.users = users;
    }

    public boolean exactOne(User other)
    {
        for(int i = 0; i<users.length; i++)
        {
            if(users[i].mutal(other) == 1)
            {
                return true;
            }
        }
        return false;
    }
    
}
