package Filters;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpFilter;
import java.io.IOException;

@WebFilter("/hello")
public class Filter extends HttpFilter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("FILTER DONE");
        chain.doFilter(request, response);
    }
}
