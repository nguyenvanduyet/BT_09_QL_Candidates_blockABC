public class BlockB extends Candidates{
    private String math;
    private String chemistry;
    private String disciple;

    public BlockB(int identificationNumber, String name, String address, String prioritize, String math, String chemistry, String disciple) {
        super(identificationNumber, name, address, prioritize);
        this.math = math;
        this.chemistry = chemistry;
        this.disciple = disciple;
    }

    @Override
    public String toString() {
        return super.toString()+","+ math +","+ chemistry +","+disciple;
    }
}
