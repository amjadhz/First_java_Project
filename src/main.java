public class main {
    public static void main(String args[])
    {
        Teacher teacher = new Teacher("Andries" , 40 , "SDE");

        Me me= new Me("Amjad Hwidy" , 26 , teacher);
        Me boris = new Me("Boris",20 , teacher);

        String me_intro = me.introduce();
        String boris_intro = boris.introduce();

        String teacher_intro = teacher.introduce();


//        System.out.println(me_intro);
//        System.out.println(boris_intro);
//        System.out.println(teacher_intro);
        me = null;

    }
}
