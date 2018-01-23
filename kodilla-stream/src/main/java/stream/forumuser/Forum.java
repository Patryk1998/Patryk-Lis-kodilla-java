package stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum(){
        usersList.add(new ForumUser(1, "Kowalski2", 'M', 0, 17, 4, 1990));
        usersList.add(new ForumUser(2, "Kowalski23", 'F', 14, 15, 5, 1991));
        usersList.add(new ForumUser(3, "Kowalski1", 'M', 19, 9, 6, 1992));
        usersList.add(new ForumUser(4, "Kowalski45", 'M', 123, 6, 7, 1993));
        usersList.add(new ForumUser(5, "Kowalski3", 'M', 4, 23, 8, 1994));
        usersList.add(new ForumUser(6, "Kowalski17", 'F', 1, 30, 9, 1995));
        usersList.add(new ForumUser(7, "Kowalski33", 'M', 140, 24, 4, 1996));
        usersList.add(new ForumUser(15, "Kowalski27", 'M', 19, 19, 4, 1997));
        usersList.add(new ForumUser(16, "Kowalski90", 'F', 14, 3, 3, 1998));
        usersList.add(new ForumUser(10, "Kowalski54", 'M', 1, 29, 4, 1999));
        usersList.add(new ForumUser(11, "Kowalski76", 'M', 34, 28, 1, 2000));
        usersList.add(new ForumUser(12, "Kowalski87", 'F', 69, 17, 5, 2001));
        usersList.add(new ForumUser(13, "Kowalski88", 'F', 21, 17, 8, 2002));
        usersList.add(new ForumUser(14, "Kowalski89", 'F', 88, 14, 11, 2003));
    }

    public List<ForumUser> getUsersList(){
        return new ArrayList<>(usersList);
    }


}
