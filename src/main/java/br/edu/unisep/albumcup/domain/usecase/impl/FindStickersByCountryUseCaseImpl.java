package br.edu.unisep.albumcup.domain.usecase.impl;

import br.edu.unisep.albumcup.data.repository.StickerRepository;
import br.edu.unisep.albumcup.domain.builder.StickerBuilder;
import br.edu.unisep.albumcup.domain.dto.ListStickerItemDto;
import br.edu.unisep.albumcup.domain.usecase.FindAllStickersUseCase;
import br.edu.unisep.albumcup.domain.usecase.FindStickersByCountryUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindStickersByCountryUseCaseImpl implements FindStickersByCountryUseCase {

    private final StickerRepository repository;
    private final StickerBuilder stickerBuilder;

    @Override
    public List<ListStickerItemDto> execute(Integer countryId) {
        var result = repository.findByCountry(countryId);
        return stickerBuilder.build(result);
    }
}
