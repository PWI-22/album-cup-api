package br.edu.unisep.albumcup.domain.usecase;

import br.edu.unisep.albumcup.domain.dto.ListStickerItemDto;

import java.util.List;

public interface FindLegendaryStickersUseCase {
    List<ListStickerItemDto> execute();
}
