package pkg1;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestBankAccount {

  @Test
  public void testDebitWithSufficientFunds() {
    BankAccount account = new BankAccount (100);
    double amount = account.debit(60);
    Assert.assertEquals(40.0, amount);
  }

}
