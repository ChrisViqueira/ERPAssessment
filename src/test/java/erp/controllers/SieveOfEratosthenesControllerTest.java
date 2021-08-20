package erp.controllers;
import erp.models.mapper.EmployeeMapper;
import erp.repository.EmployeeRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
public class SieveOfEratosthenesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    private int MAX_NUMBER = 9;

    private String PRIME_LIST = "[2,3,5,7]";

    @MockBean
    EmployeeMapper mapper;

    @MockBean
    EmployeeRepository repository;

    @Test
    @DisplayName("Given a number less than zero: Should receive a 400 error.")
    public void givenNumberLessThanZero_thenStatus400() throws Exception{
        mockMvc.perform(get("/q1/-1")).andDo(print()).andExpect(status().isBadRequest());
    }

    @Test
    @DisplayName("Given no value: Should receive a 404 error.")
    public void givenNull_thenStatus400() throws Exception {
        mockMvc.perform(get("/q1/")).andDo(print()).andExpect(status().isNotFound());
    }

    @Test
    @DisplayName("Given a number greater than zero: Should receive a 200 error.")
    public void givenNumberGreaterThanZero_thenStatus200() throws Exception {
        this.mockMvc.perform(get("/q1/" + MAX_NUMBER)).andDo(print()).andExpect(status().isOk())
                .andExpect(content().string(PRIME_LIST.toString().trim()));
    }
}
