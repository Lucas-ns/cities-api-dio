package com.github.lucasns.cities.api.countries.repository;

import com.github.lucasns.cities.api.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository <Country, Long> {
}
