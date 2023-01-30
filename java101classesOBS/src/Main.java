public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "TRH", "5445");
        Teacher t2 = new Teacher("Graham Bell", "FZK", "0000");
        Teacher t3 = new Teacher("Kimyacı Arif", "KMY", "1111");


        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102","FZK");
        fizik.addTeacher(t2);
        Course kimya = new Course("Kimya", "103", "KMY");
        kimya.addTeacher(t3);

        Student s1 = new Student("Ali Veli","123", "4", tarih, fizik, kimya);
        s1.addBulkExamNote(70,50,100);
        s1.isPass();

        Student s2 = new Student("Ayşe", "456", "4",tarih, fizik, kimya);
        s2.addBulkExamNote(90,70,82);
        s2.isPass();
    }
}