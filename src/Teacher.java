public class Teacher extends Person{
    public Teacher (String name , int age , String fav_course) {
        Name = name;
        Age=age;
        Favorite_course= fav_course;

    }

    public String introduce () {
        String msg = "Hello class , I'm "
                + this.Name
                + " and I'm "
                + this.Age
                + " years old!"
                + " My favorite course is "
                + this.Favorite_course
                + ", Enjoy ✌";

        return msg;
    }
}
