public class BlockC extends Candidates{
    private String literature;
    private String history;
    private String geography;

    public BlockC(int identificationNumber, String name, String address, String prioritize, String literature, String history, String geography) {
        super(identificationNumber, name, address, prioritize);
        this.literature = literature;
        this.history = history;
        this.geography = geography;
    }

    @Override
    public String toString() {
        return super.toString()+literature+","+history+","+geography;
    }
}
