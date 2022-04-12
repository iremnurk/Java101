public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarageFizik;
    double avarageMat;
    double avarageKimya;
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


    public void addBulkExamNote(int mat, int fizik, int kimya,int matquiz,int fizikquiz,int kimyaquiz) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if ( matquiz>= 0 && matquiz <= 100) {
            this.mat.quiz = matquiz;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;

        }
        if (fizikquiz >= 0 && fizikquiz <= 100) {
            this.fizik.quiz = fizikquiz;

        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;

        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.quiz = kimyaquiz;

        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 ||this.mat.quiz == 0 || this.fizik.quiz == 0 || this.kimya.quiz == 0) {
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
        this.avarageFizik = ((this.fizik.note)*0.20 +(this.fizik.quiz*0.80));
        this.avarageMat = ((this.mat.note*0.20) +(this.mat.quiz*0.80));
        this.avarageKimya = ((this.kimya.note*0.20) +(this.kimya.quiz*0.80));
        this.avarage=(avarageFizik+avarageMat+avarageKimya)/3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Sınav Notu : " + this.mat.note);
        System.out.println("Matematik Quiz(Sozlu) Notu : " + this.mat.quiz);
        System.out.println("Fizik Sınav  Notu : " + this.fizik.note);
        System.out.println("Fizik Quiz(Sozlu)  Notu : " + this.fizik.quiz);
        System.out.println("Kimya Sınav Notu : " + this.kimya.note);
        System.out.println("Kimya Quiz(Sozlu) Notu : " + this.kimya.quiz);

    }

}