package ss2_constructor_fraction;

public class Fraction {
    private int tuSo;
    private int mauSo;

    public Fraction() {
        tuSo = 0;
        mauSo = 1;
    }

    public Fraction(int tuSo) {
        this.tuSo = tuSo;
        mauSo = 1;
    }

    public Fraction(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    void output() {
        if (tuSo == 0) {
            System.out.println(tuSo);
        } else {
            rutGon();
            if (mauSo == 1) {
                System.out.printf("%d", tuSo);
            } else {
                System.out.printf("%d/%d", tuSo, mauSo);
            }
            System.out.println();
        }
    }

    private int uocChungLonNhat(int tuSo, int mauSo) {
        tuSo = Math.abs(tuSo);
        for (int i = tuSo; i >= 1; i--) {
            if (tuSo % i == 0 && mauSo % i == 0) {
                return i;
            }
        }
        return 1;
    }

    private void rutGon() {
        int ucln = uocChungLonNhat(tuSo,mauSo);
        tuSo = tuSo / ucln;
        mauSo = mauSo / ucln;
        if (mauSo < 0) {
            tuSo = -tuSo;
            mauSo = -mauSo;
        }
    }
}
