public class User {
    private String name;
    private int id;
    private int[] friendsID;
    
    public User(String name, int id, int[] friendsID) {
        this.name = name;
        this.id = id;
        this.friendsID = friendsID;
    }
    
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int[] getFriendsID() {
        return friendsID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFriendsID(int[] friendsID) {
        this.friendsID = friendsID;
    }
    
    public int mutal(User other)
    {
        int countFriends = 0;
        for(int i = 0; i<this.friendsID.length; i++)
        {
            for(int j = 0; j<other.getFriendsID().length; j++)
            {
                if(other.getFriendsID()[j] == this.friendsID[i])
                {
                    countFriends++;
                    break;
                }
            }
        }
        return countFriends;

    }
    
}
