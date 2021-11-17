public class Me extends Person {

    private Teacher likes ;

        public Me (String name, int age , Teacher teacher) {
            this.Name = name;
            this.Age = age;
            this.likes=teacher;

        }

        public String introduce () {
            String msg = "Hi, I'm "
                            + this.Name
                            + " and I'm "
                            + this.Age
                            + " years old!";

            String ext = " And my best teacher is "
                            + this.likes.Name
                            + ".";

            return msg + ext;
        }
}
