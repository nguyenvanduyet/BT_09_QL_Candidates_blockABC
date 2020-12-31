public class BlockA extends Candidates {
    private String math;
    private String physics;
    private String chemistry;

    public BlockA(int identificationNumber, String name, String address, String prioritize, String math, String physics, String chemistry) {
        super(identificationNumber, name, address, prioritize);
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return super.toString()+ math +","+physics+","+ chemistry;
    }
}
