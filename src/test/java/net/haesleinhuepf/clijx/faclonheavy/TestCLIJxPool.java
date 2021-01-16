package net.haesleinhuepf.clijx.faclonheavy;

import org.junit.Test;

public class TestCLIJxPool {
    @Test
    public void test_pool_from_indices() {
        CLIJxPool pool = new CLIJxPool(new int[]{0}, new int[]{1});
        assert pool.size() == 1;
    }

    @Test
    public void test_pool_from_device_names() {
        CLIJxPool pool = CLIJxPool.fromDeviceNames(new String[]{"UHD"}, new int[]{1});
        assert pool.size() == 1;
    }

    @Test
    public void test_pool_from_predefined() {
        CLIJxPool pool = CLIJxPool.fullPool();
        assert pool.size() >0;
    }

}
