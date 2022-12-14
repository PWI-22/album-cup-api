package br.edu.unisep.albumcup.domain.usecase;

import br.edu.unisep.albumcup.domain.dto.ListStickerItemDto;

import java.util.List;

public interface FindAllStickersUseCase {
    List<ListStickerItemDto> execute();
}
