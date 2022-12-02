package br.edu.unisep.albumcup.domain.usecase.impl;

import br.edu.unisep.albumcup.data.repository.StickerRepository;
import br.edu.unisep.albumcup.domain.builder.StickerBuilder;
import br.edu.unisep.albumcup.domain.dto.ListStickerItemDto;
import br.edu.unisep.albumcup.domain.usecase.FindAllStickersUseCase;
import br.edu.unisep.albumcup.domain.usecase.FindLegendaryStickersUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FindLegendaryStickersUseCaseImpl implements FindLegendaryStickersUseCase {

    private final StickerRepository repository;
    private final StickerBuilder stickerBuilder;

    @Override
    public List<ListStickerItemDto> execute() {
        var result = repository.findAllLegendary();
        return stickerBuilder.build(result);
    }
}
