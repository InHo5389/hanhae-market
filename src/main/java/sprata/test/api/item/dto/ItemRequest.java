package sprata.test.api.item.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import sprata.test.domain.item.dto.ItemCommand;

public class ItemRequest {

    @Getter
    @AllArgsConstructor
    public static class Create{
        private String username;
        private String title;
        private String content;
        private int price;

        public ItemCommand.Create toCommand(){
            return ItemCommand.Create.builder()
                    .username(username)
                    .title(title)
                    .content(content)
                    .price(price)
                    .build();
        }
    }

    @Getter
    @AllArgsConstructor
    public static class Put{
        private String title;
        private String content;
        private int price;
        private String username;

        public ItemCommand.Put toCommand(){
            return ItemCommand.Put.builder()
                    .username(username)
                    .title(title)
                    .content(content)
                    .price(price)
                    .build();
        }
    }
}
