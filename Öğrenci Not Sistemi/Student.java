public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya, int matOralExamNote, int fizikOralExamNote, int kimyaOralExamNote) {

        if (mat >= 0 && mat <= 100 && matOralExamNote >= 0 && matOralExamNote <= 100) {
            this.mat.note = mat;
            this.mat.oralExamNote = matOralExamNote;
        }

        if (fizik >= 0 && fizik <= 100 && fizikOralExamNote >= 0 && fizikOralExamNote <= 100) {
            this.fizik.note = fizik;
            this.fizik.oralExamNote = fizikOralExamNote;
        }

        if (kimya >= 0 && kimya <= 100 && kimyaOralExamNote >=0 && kimyaOralExamNote <= 100) {
            this.kimya.note = kimya;
            this.kimya.oralExamNote = kimyaOralExamNote;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.fizik.oralExamNote ==0 || this.mat.oralExamNote == 0 || this.kimya.oralExamNote == 0 ) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double fizikTotalNote = this.fizik.note * 0.80 + this.fizik.oralExamNote * 0.20;
        double kimyaTotalNote = this.kimya.note * 0.80 + this.kimya.oralExamNote * 0.20;
        double matTotalNote = this.mat.note * 0.80 + this.mat.oralExamNote * 0.20;
        this.avarage = (fizikTotalNote + kimyaTotalNote + matTotalNote) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        double fizikTotalNote = this.fizik.note * 0.80 + this.fizik.oralExamNote * 0.20;
        double kimyaTotalNote = this.kimya.note * 0.80 + this.kimya.oralExamNote * 0.20;
        double matTotalNote = this.mat.note * 0.80 + this.mat.oralExamNote * 0.20;
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + matTotalNote);
        System.out.println("Fizik Notu : " + fizikTotalNote);
        System.out.println("Kimya Notu : " + kimyaTotalNote);
    }

}
