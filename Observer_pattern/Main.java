package Observer_pattern;
public class Main
{
	public static void main(String[] args) {
		TradingApp ta = new TradingApp();
		User ap = new User(ta);
        User ap2 = new User(ta);
		ta.setPrice(1000.234);
		ta.setPrice(9998.2233);
	}
}