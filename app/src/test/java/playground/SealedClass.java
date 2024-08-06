package playground;

import org.junit.jupiter.api.Test;

import java.util.List;

sealed interface BankingEvent {
    permits PaymentEvent;
}

enum PaymentEvent implements BankingEvent {Payment_Rejected, Payment_Accepted,}

public class SealedClass {
    @Test void events() {
        List<BankingEvent> events = List.of(PaymentEvent.Payment_Rejected, PaymentEvent.Payment_Accepted);

    }
}
