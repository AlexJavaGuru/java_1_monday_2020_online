package student_artur_martinenko.homework.lesson_14.level_3_6_junior.task18_38;

import org.junit.Before;
import org.junit.Test;
import teacher.annotations.CodeReview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

@CodeReview(approved = true)
public class TransactionAnalysisServiceTest {
    TransactionAnalysisService transactionAnalysisService;
    List<Transaction> transactionList = (new TransactionTestData()).getTransactions();

    @Before
    public void setUp() {
        transactionAnalysisService = new TransactionAnalysisService();
    }

    //Task_20-21
    @Test
    public void ShouldReturnTransactionMadeIn2011() {
        List<Transaction> transactionsMade = transactionAnalysisService.findTransactionsIn2011(transactionList, 2011);
        assertEquals(2, transactionsMade.size());

    }

    //Task_20-21
    @Test
    public void ShouldReturnTransactionMadeIn2012() {
        List<Transaction> transactionsMade = transactionAnalysisService.findTransactionsIn2011(transactionList, 2012);
        assertEquals(4, transactionsMade.size());

    }

    //Task_20-21
    @Test
    public void ShouldReturnTransactionMadeIn2013() {
        List<Transaction> transactionsMade = transactionAnalysisService.findTransactionsIn2011(transactionList, 2013);
        assertEquals(0, transactionsMade.size());

    }

    //Task_22
    @Test
    public void ShouldReturnSortedTransactionsByValueAscendingOrder() {
        List<Transaction> transactionsMade = transactionAnalysisService.sortTransactionsByValueAscending(transactionList);
        List<Integer> valuesShouldBe = Arrays.asList(300, 400, 700, 710, 950, 1000);
        List<Integer> valuesExpected = transactionsMade.stream()
                .map(Transaction::getValue)
                .collect(Collectors.toList());
        assertEquals(valuesExpected, valuesShouldBe);
    }

    //Task_23
    @Test
    public void ShouldReturnSortedTransactionsByValueDescendingOrder() {
        List<Transaction> transactionsMade = transactionAnalysisService.sortTransactionsByValueDescending(transactionList);
        List<Integer> valuesShouldBe = Arrays.asList(1000, 950, 710, 700, 400, 300);
        List<Integer> valuesExpected = transactionsMade.stream()
                .map(Transaction::getValue)
                .collect(Collectors.toList());
        assertEquals(valuesExpected, valuesShouldBe);
    }

    //Task_24
    @Test
    public void ShouldReturnSortedTransactionsBy2011ValueAscending() {
        List<Transaction> valuesExpected = transactionAnalysisService.sortTransactionsBy2011ValueAscending(transactionList);
        List<Integer> valuesExpectedInteger = valuesExpected.stream()
                .map(Transaction::getValue)
                .collect(Collectors.toList());
        List<Integer> valuesShouldBe = Arrays.asList(300, 400);
        assertEquals(valuesShouldBe, valuesExpectedInteger);
    }

    //Task_25
    @Test
    public void ShouldReturnYearsOfTransactionsMade() {
        List<Integer> valuesExpected = transactionAnalysisService.yearsOfTransactionsMade(transactionList);
        List<Integer> valuesShouldBe = Arrays.asList(2011, 2012, 2011, 2012, 2012, 2012);
        assertEquals(valuesShouldBe, valuesExpected);
    }

    //Task_26
    @Test
    public void ShouldReturnUniqueYearsOfTransactionsMade() {
        List<Integer> valuesExpected = transactionAnalysisService.uniqueYearsOfTransactionsMade(transactionList);
        List<Integer> valuesShouldBe = Arrays.asList(2011, 2012);
        assertEquals(valuesShouldBe, valuesExpected);
    }

    //Task_27
    @Test
    public void ShouldReturnUniqueTraderNamesOfTransactionsMade() {
        List<String> valuesExpected = transactionAnalysisService.uniqueTraderNamesOfTransactionsMade(transactionList);
        List<String> valuesShouldBe = Arrays.asList("Brian", "Raoul", "Mario", "Alan");
        assertEquals(valuesShouldBe, valuesExpected);
    }

    //Task_28
    @Test
    public void ShouldReturnUniqueCityNamesOfTransactionsMade() {
        List<String> valuesExpected = transactionAnalysisService.uniqueCityNamesOfTransactionsMade(transactionList);
        List<String> valuesShouldBe = Arrays.asList("Cambridge", "Milan");
        assertEquals(valuesShouldBe, valuesExpected);
    }

    //Task_29
    @Test
    public void ShouldReturnTraderNamesFromCambridge() {
        List<String> valuesExpected = transactionAnalysisService.traderNamesFromCambridge(transactionList);
        List<String> valuesShouldBe = Arrays.asList("Brian", "Raoul", "Alan");
        assertEquals(valuesShouldBe, valuesExpected);
    }

    //Task_30-31
    @Test
    public void ShouldReturnTraderNamesFromCustomCityCambridge() {
        List<String> valuesExpected = transactionAnalysisService.traderNamesFromCustomCity(transactionList, "Cambridge");
        List<String> valuesShouldBe = Arrays.asList("Brian", "Raoul", "Alan");
        assertEquals(valuesShouldBe, valuesExpected);
    }

    //Task_30-31
    @Test
    public void ShouldReturnTraderNamesFromCustomCityLondon() {
        List<String> valuesExpected = transactionAnalysisService.traderNamesFromCustomCity(transactionList, "London");
        List<String> valuesShouldBe = new ArrayList<>();
        assertEquals(valuesShouldBe, valuesExpected);
    }

    //Task_30-31
    @Test
    public void ShouldReturnTraderNamesFromCustomCityMilan() {
        List<String> valuesExpected = transactionAnalysisService.traderNamesFromCustomCity(transactionList, "Milan");
        List<String> valuesShouldBe = Arrays.asList("Mario");
        assertEquals(valuesShouldBe, valuesExpected);
    }

    //Task_32
    @Test
    public void ShouldReturnTradersFromMilanIsPresent() {
        boolean valuesExpected = transactionAnalysisService.tradersFromMilanIsPresent(transactionList);
        assertEquals(true, valuesExpected);
    }

    //Task_33-34
    @Test
    public void ShouldReturnTradersFromGivenCityIsPresentMilan() {
        boolean valuesExpected = transactionAnalysisService.tradersFromGivenCityIsPresent(transactionList, "Milan");
        assertEquals(true, valuesExpected);
    }

    //Task_33-34
    @Test
    public void ShouldReturnTradersFromGivenCityIsPresentLondon() {
        boolean valuesExpected = transactionAnalysisService.tradersFromGivenCityIsPresent(transactionList, "London");
        assertEquals(false, valuesExpected);
    }

    //Task_33-34
    @Test
    public void ShouldReturnTradersFromGivenCityIsPresentCambridge() {
        boolean valuesExpected = transactionAnalysisService.tradersFromGivenCityIsPresent(transactionList, "Cambridge");
        assertEquals(true, valuesExpected);
    }

    //Task_35
    @Test
    public void ShouldReturnMaxValueFormGivenTransactions() {
        Optional<Integer> valuesExpected = transactionAnalysisService.maxValueFormGivenTransactions(transactionList);
        if (valuesExpected.isPresent()) {
            Integer valuesShouldBe = 1000;
            assertEquals(valuesShouldBe, valuesExpected.get());
        } else {
            assertTrue(true);
        }
    }

    //Task_35
    @Test
    public void ShouldReturnMaxValueFormGivenTransactionsEmptyList() {
        Optional<Integer> valuesExpected = transactionAnalysisService.maxValueFormGivenTransactions(new ArrayList<>());
        if (valuesExpected.isPresent()) {
            Integer valuesShouldBe = 0;
            assertEquals(valuesShouldBe, valuesExpected.get());
        } else {
            assertTrue(true);
        }
    }

    //Task_36
    @Test
    public void ShouldReturnMinValueFormGivenTransactions() {
        Optional<Integer> valuesExpected = transactionAnalysisService.minValueFormGivenTransactions(transactionList);
        if (valuesExpected.isPresent()) {
            Integer valuesShouldBe = 300;
            assertEquals(valuesShouldBe, valuesExpected.get());
        } else {
            assertTrue(true);
        }
    }

    //Task_36
    @Test
    public void ShouldReturnMinValueFormGivenTransactionsEmptyList() {
        Optional<Integer> valuesExpected = transactionAnalysisService.minValueFormGivenTransactions(new ArrayList<>());
        if (valuesExpected.isPresent()) {
            Integer valuesShouldBe = 0;
            assertEquals(valuesShouldBe, valuesExpected.get());
        } else {
            assertTrue(true);
        }
    }

    //Task_37
    @Test
    public void ShouldGetTraderNameListInNaturalOrder() {
        String valuesExpected = transactionAnalysisService.getTraderNameListInNaturalOrder(transactionList);
        String valuesShouldBe = "Alan,Brian,Mario,Raoul";
        assertEquals(valuesShouldBe, valuesExpected);
    }

    //Task_38
    @Test
    public void ShouldGetTraderCityListInNaturalOrder() {
        String valuesExpected = transactionAnalysisService.getTraderCityListInNaturalOrder(transactionList);
        String valuesShouldBe = "Cambridge,Milan";
        assertEquals(valuesShouldBe, valuesExpected);
    }


}