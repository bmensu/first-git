package pkg1;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {

  @Test
  public void testDebitWithSufficientFunds() {
    BankAccount account = new BankAccount (100);
    double amount = account.debit(60);
    Assert.assertEquals(60.0, amount);
  }

  @Test
  public void testDebitWithInsufficientFunds() {
    BankAccount account = new BankAccount (100);
    double amount = account.debit(200);
    Assert.assertEquals(100.0, amount);
  }

}
