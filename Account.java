class Account {
	// variables
	private int customerNumber;
	private int pinNumber;
	private double checkingBalance = 0;

	Scanner input = new Scanner(System.in);

	public Account() {
	}

	public Account(int customerNumber, int pinNumber) {
		this.customerNumber = customerNumber;
		this.pinNumber = pinNumber;
	}

	public Account(int customerNumber, int pinNumber, double checkingBalance) {
		this.customerNumber = customerNumber;
		this.pinNumber = pinNumber;
		this.checkingBalance = checkingBalance;
	}

	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public double getCheckingBalance() {
		return checkingBalance;
	}

	public double calcCheckingWithdraw(double amount) {
		checkingBalance = (checkingBalance - amount);
		return checkingBalance;
	}

	public double calcCheckingDeposit(double amount) {
		checkingBalance = (checkingBalance + amount);
		return checkingBalance;
	}

	void credit(){ 
        System.out.println("Enter the Amount: ");
		int amt = input.nextInt();
		calcCheckingDeposit(amt);
    }

    void debit(){
        System.out.print("Enter withdrawal amount multiple of 100: ");
		int amt = input.nextInt();
		if(amt%100==0) calcCheckingWithdraw(amt);
		else System.out.print("Invalid Amount");
    }

	public void pinChange() {
		System.out.print("Enter the old Pin Number: ");
		int pin = input.nextInt();
		if(pin==pinNumber){
			System.out.print("Enter the New Pin Number: ");
			pin = input.nextInt();
			pinNumber = pin;
		}
		else{
			System.out.print("!!Invalid Pin Number!!");
		}
	}
}
