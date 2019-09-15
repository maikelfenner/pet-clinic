package br.com.maikelfenner.services;

import br.com.maikelfenner.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
