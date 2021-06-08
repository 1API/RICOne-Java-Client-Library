package riconeapi.library.client.request;

import java.util.function.Consumer;

/**
 * @author Andrew Pieniezny <andrew.pieniezny@neric.org>
 * @version 2.0.0
 * @since 1/21/2021
 */
// Paging builder
final class Paging {
    private int navigationPage;
    private int navigationPageSize;

    // Default paging values of navigationPage 1, navigationPageSize 100.
    Paging() {
        this.navigationPage = 1;
        this.navigationPageSize = 100;
    }

    int getNavigationPage() { return navigationPage; }

    int getNavigationPageSize() { return navigationPageSize; }

    /**
     * Builder class that appends the paging components to the Paging class.
     */
    public static class XPagingBuilder {
        private Paging instance = new Paging();
        private XRequest.XRequestBuilder parentBuilder;
        private Consumer<Paging> consumer;

        /**
         * Empty constructor.
         */
        public XPagingBuilder() {}

        /**
         * Constructor that sets the parent request builder and the paging child builder.
         * @param b the XRequest builder.
         * @param c the Paging builder.
         */
        public XPagingBuilder(XRequest.XRequestBuilder b, Consumer<Paging> c) {
            this.parentBuilder = b;
            this.consumer = c;
        }

        /**
         * The page of the request.
         * @param navigationPage page to retrieve.
         * @return the navigation page.
         */
        public XPagingBuilder navigationPage(int navigationPage) {
            this.instance.navigationPage = navigationPage;
            return this;
        }

        /**
         * The page size of the request.
         * @param navigationPageSize number of records to retrieve.
         * @return the navigation page size.
         */
        public XPagingBuilder navigationPageSize(int navigationPageSize) {
            this.instance.navigationPageSize = navigationPageSize;
            return this;
        }

        /**
         * Build the paging components in XPaging builder and store paging in XRequest.XRequestBuilder.
         * @return paging components to the XRequest.XRequestBuilder parent builder.
         */
        public XRequest.XRequestBuilder end() {
            consumer.accept(instance);
            return parentBuilder;
        }
    }
}
