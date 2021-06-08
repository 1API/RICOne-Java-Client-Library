package riconeapi.library.client.common;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Abstract class that can check whether an object model response returns empty or has data.
 */
public abstract class Model {
    /**
     * Checks whether a model object response is empty.
     * @return true if empty.
     */
    @JsonIgnore
    public boolean isEmpty() {
        return true;
    }

    /**
     * Checks whether a model object response has data.
     * @return a boolean value.
     */
    @JsonIgnore
    public boolean hasData() {
        return !isEmpty();
    }
}
