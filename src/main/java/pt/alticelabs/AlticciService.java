package pt.alticelabs;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AlticciService {

	private Map<Long, BigDecimal> numbers = Collections.synchronizedMap(new LinkedHashMap<>());

	private BigDecimal zero = new BigDecimal(0);
	private BigDecimal um = new BigDecimal(1);
	
	/**
	 * Cálcula o número de Alticci a(n), colocando em cache no HashMap todos os valores 
	 * intermediários utilizados para chegar no valor de a(n)
	 * @param n
	 * @return a(n)
	 */
	public BigDecimal alticci(Long n) {
		BigDecimal result = numbers.get(n);
		if (result != null) {
			return result;
		}
		if (n == 0) {
			return zero;
		} else if (n == 1) {
			return um;
		} else if (n == 2) {
			return um;
		} else {
			BigDecimal alt1 = numbers.get(n - 3);
			if (alt1 == null) {
				alt1 = alticci(n - 3);
				numbers.put(n - 3, alt1);
			}
			BigDecimal alt2 = numbers.get(n - 2);
			if (alt2 == null) {
				alt2 = alticci(n - 2);
				numbers.put(n - 2, alt2);
			}
			result = alt1.add(alt2);
			numbers.put(n, result);
			return result;
		}
	}

}