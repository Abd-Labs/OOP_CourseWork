package Task5;
public class PhoneNumber {
    private int countryCode;
    private int cityCode;
    private int lineNo;

    public PhoneNumber(int countryCode, int cityCode, int lineNo) {
        this.countryCode = countryCode;
        this.cityCode = cityCode;
        this.lineNo = lineNo;
    }

    public PhoneNumber() {
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getLineNo() {
        return lineNo;
    }

    public void setLineNo(int lineNo) {
        this.lineNo = lineNo;
    }

    @Override
    public String toString() {
        return "{" +
                "countryCode=" + countryCode +
                ", cityCode=" + cityCode +
                ", lineNo=" + lineNo +
                '}';
    }
}
