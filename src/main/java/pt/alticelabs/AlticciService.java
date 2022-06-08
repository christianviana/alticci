package pt.alticelabs;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AlticciService {

	private Map<Long, Long> numbers = Collections.synchronizedMap(new LinkedHashMap<>());

	/**
	 * Cálcula o número de Alticci a(n), colocando em cache no HashMap todos os valores 
	 * intermediários utilizados para chegar no valor de a(n)
	 * @param n
	 * @return a(n)
	 */
	public synchronized Long alticci(Long n) {
		Long result = numbers.get(n);
		if (result != null) {
			return result;
		}
		if (n == 0) {
			return 0L;
		} else if (n == 1) {
			return 1L;
		} else if (n == 2) {
			return 1L;
		} else {
			Long alt1 = numbers.get(n - 3);
			if (alt1 == null) {
				alt1 = alticci(n - 3);
				numbers.put(n - 3, alt1);
			}
			Long alt2 = numbers.get(n - 2);
			if (alt2 == null) {
				alt2 = alticci(n - 2);
				numbers.put(n - 2, alt2);
			}
			numbers.put(n, alt1 + alt2);
			return alt1 + alt2;
		}
	}

}