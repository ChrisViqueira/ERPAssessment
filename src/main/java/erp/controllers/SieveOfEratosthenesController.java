package erp.controllers;

import erp.exceptions.NumNotFoundException;
import java.lang.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@NoArgsConstructor
@RestController
@RequestMapping("/q1")
public class SieveOfEratosthenesController {

    @GetMapping("/{finalNum}")
    @ResponseStatus(HttpStatus.OK)
    public List<Integer> calculate(@PathVariable Integer finalNum) {
        if (finalNum == null || finalNum.intValue() <= 0)
            throw new NumNotFoundException();

        Map<Integer, Boolean> primeList = new HashMap<>();
        // Populate the list
        for (int a = 2; a <= finalNum; a++)
            primeList.put(a, true);

        // Algorithm from:
        // https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
        for (int i = 2; i <= (int) Math.floor(Math.sqrt(finalNum)); i++) {
            int multCounter = 0;
            if (primeList.get(i)) { // If true
                int j = (int) Math.pow(i, 2) + i * multCounter;
                while (j <= finalNum) {
                    primeList.put(j, false);
                    j = (int) Math.pow(i, 2) + i * multCounter;
                    multCounter++;
                }
            }
            multCounter = 0;
        }

        // Create the final list
        List<Integer> primeSet = new ArrayList<>();
        for (Map.Entry<Integer, Boolean> entry : primeList.entrySet()) {
            if (entry.getValue())
                primeSet.add(entry.getKey());
        }
        return primeSet;
    }
}
