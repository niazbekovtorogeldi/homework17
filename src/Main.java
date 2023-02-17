public class Main {
    public static void main(String[] args) {
        Java java =new Java("togeldi",16,"M","smadn@gmail.com");
        Java java1 =new Java("muna",17,"J","muna@gmail.com");
        Java java2 =new Java("ukan",22,"M","ulan@gmail.com");
        Java java3 =new Java("datka",19,"J","datka@gmail.com");
        Java java4 =new Java("nasip",15,"M","nasip@gmail.com");
        Java [] javas = {java,java1,java2,java3,java4};
        Android android = new Android("Aslan",28,"M","aslan@gmail.com");
        Android android1 = new Android("kadyr",24,"M","kadyr@gmail.com");
        Android android2 = new Android("sapar",25,"M","sapar@gmail.com");
        Android []androids = {android,android1,android2};
        Go go = new Go("janna",21,"J","janna@gmail.com");
        Go go1 = new Go("anna",17,"J","anna@gmail.com");
        Go []gos= {go,go1};
        Company company = new Company("гражданская",javas,androids,gos,"esen niazov\n");

        System.out.println("company 1:"+company.toString());

        Java java5 = new Java("asan",33,"M","asan@gmail.com");
        Java java6 = new Java("yson",33,"M","yson@gmail.com");
        Java[]javas1 ={java5,java6};
        Android android3 = new Android("manas",28,"M","manas@gmail.com");
        Android []androids1={android3};
        Go go2 = new Go("anna",22,"J","anna@gmail.com");
        Go []gos1= {go2};
        Company company1 = new Company("гражданская 119",javas1,androids1,gos1,"esen niazov");
        System.out.println("company 2 :"+company1.toString());








    }
}