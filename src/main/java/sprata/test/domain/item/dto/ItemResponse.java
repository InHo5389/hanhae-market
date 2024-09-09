package sprata.test.domain.item.dto;

import lombok.Getter;
import sprata.test.domain.item.Item;

public class ItemResponse {

    @Getter
    public static class Create {
        private Long id;
        private String username;
        private String title;
        private String content;
        private int price;

        public Create(Item item) {
            this.id = item.getId();
            this.username = item.getUsername();
            this.title = item.getTitle();
            this.content = item.getContent();
            this.price = item.getPrice();
        }
    }

    @Getter
    public static class GetAll{
        private Long id;
        private String title;
        private String username;
        private int price;

        public GetAll(Item item) {
            this.id = item.getId();
            this.title = item.getTitle();
            this.username = item.getUsername();
            this.price = item.getPrice();
        }
    }

    @Getter
    public static class Put{
        private Long id;
        private String title;
        private String content;
        private int price;
        private String username;

        public Put(Item item) {
            this.id = item.getId();
            this.username = item.getUsername();
            this.title = item.getTitle();
            this.content = item.getContent();
            this.price = item.getPrice();
        }
    }

    @Getter
    public static class Delete{
        private String message;

        public Delete(String message) {
            this.message = message;
        }
    }
}
