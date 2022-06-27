package com.efragance.persistence.repositories.filter;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class IngredientAttrTestFilter {

    private Long ingredientId;

    private Long attrTypeId;

    private String value;
}
