package com.cpt.payments.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cpt.payments.dao.ValidationRuleDAO;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class ValidationRuleDAOImpl implements ValidationRuleDAO {

	private NamedParameterJdbcTemplate jdbcTemplate;

	public ValidationRuleDAOImpl(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public List<String> loadActiveValidatorNames() {
		log.info("Loading active validator names");
		 String sql = "SELECT validatorName " +
                 "FROM validations.validation_rules " +
                 "WHERE isActive = TRUE " +
                 "ORDER BY priority ASC";

    List<String> activeValidatorRules = jdbcTemplate.queryForList(sql, Map.of(), String.class);
    log.info("Active validator names: {}" + activeValidatorRules);
	return activeValidatorRules;
	}

}
