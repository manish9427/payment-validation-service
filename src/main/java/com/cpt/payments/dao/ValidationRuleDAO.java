package com.cpt.payments.dao;

import java.util.List;

public interface ValidationRuleDAO {
	List<String> loadActiveValidatorNames();
}
