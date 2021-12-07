package com.example.project.repository.order;

import org.junit.Before;
import static org.mockito.Mockito.mock;

/**
 * Unit test for {@link OrderRepository}
 *
 * @author Kayhan Öztürk
 * @version 0.1
 * @since   0.1
 */
public class OrderRepositoryTest {

    private OrderRepository orderRepository;

    @Before
    public void setUp() throws Exception {
        orderRepository = mock(OrderRepository.class);
    }
}
