package com.geekhub;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class that represents page that could be downloaded by specified URL.
 * Allows high-level access to page elements.
 */
public class Page {

    private static final Pattern imageLinkPattern = Pattern.compile("<img.*?src=\"(.*?)\".*?(/>|</img>)");

    private String content;
    private URL url;

    /**
     * Be careful, constructor downloads content, it could be slow.
     *
     * @param url
     * @throws java.io.IOException
     */
    public Page(URL url) throws IOException {
        //TODO: Implement me
    }

    /**
     * Extracts all links to images from the page like <img src={link}/>. Method does not cache content. Each time new list will be returned.
     *
     * @return list of URLs to images from that page.
     * @throws java.net.MalformedURLException
     */
    public Collection<URL> getImageLinks() throws MalformedURLException {
        return extractMatches(imageLinkPattern.matcher(content));
    }

    private Collection<URL> extractMatches(Matcher matcher) throws MalformedURLException {
        //TODO: Implement me
        return null;
    }
}
