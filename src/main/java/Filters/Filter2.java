package Filters;

import javax.servlet.*;
import javax.servlet.Filter;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebFilter("/hello")
public class Filter2 implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        System.out.println("FILTER 2 DONE");
        chain.doFilter(request, response);
    }
}
