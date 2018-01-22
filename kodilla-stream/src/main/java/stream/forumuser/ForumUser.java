package stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int identifier;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsQuantity;

    public ForumUser(final int identifier, final String username, final  char sex, final int postsQuantity, final int day, final int month, final int year) {
        this.identifier = identifier;
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(year, month, day);
        this.postsQuantity = postsQuantity;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public int getBirthYear() {
        return birthDate.getYear();
    }

    public int getBirthMonth(){
        return birthDate.getMonthValue();
    }

    public int getBirthDay(){
        return birthDate.getDayOfMonth();
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    @Override
    public String toString(){
        return username + " " + sex +" "+ birthDate + " " + postsQuantity;

    }
}
