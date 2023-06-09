package householdledger;

public class AccountDto {
    private String date;
    private int num;
    private String use;
    private String moneyInOut;
    private int amount;
    private String memo;

    public AccountDto() {
    }

    public AccountDto(String date, int num, String use, String moneyInOut, int amount, String memo) {
        super();
        this.date = date;
        this.num = num;
        this.use = use;
        this.moneyInOut = moneyInOut;
        this.amount = amount;
        this.memo = memo;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getUse() {
        return use;
    }
    public void setUse(String use) {
        this.use = use;
    }
    public String getMoneyInOut() {
        return moneyInOut;
    }
    public void setMoneyInOut(String moneyIn) {
        this.moneyInOut = moneyInOut;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getMemo() {
        return memo;
    }
    public void setMemo(String memo) {
        this.memo = memo;
    }
    @Override
    public String toString() {
        return "<날짜 : " + date + "> <번호 : " + num + "번> <용도 : " + use + "> <수입/지출 : " + moneyInOut + "> <비용 : " + amount + "원> <내용 : " + memo + ">";
    }
    public String print(){
        return date + "," + num + "," + use + "," + moneyInOut + "," + amount + "," + memo;
    }
}
