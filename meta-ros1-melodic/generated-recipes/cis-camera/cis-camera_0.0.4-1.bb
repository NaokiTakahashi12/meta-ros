# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The cis_camera package"
AUTHOR = "Tokyo Opensource Robotics Kyokai (TORK) Development Team <dev@opensource-robotics.tokyo.jp>"
ROS_AUTHOR = "Yosuke Yamamoto <yamamoto.yosuke@opensource-robotics.tokyo.jp>"
HOMEPAGE = "http://wiki.ros.org/cis_camera"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "cis_camera"
ROS_BPN = "cis_camera"

ROS_BUILD_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    dynamic-reconfigure \
    image-transport \
    libuvc \
    nodelet \
    pcl-ros \
    pluginlib \
    roscpp \
    roslint \
    rostest \
    sensor-msgs \
    tf \
    tf-conversions \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    dynamic-reconfigure \
    image-transport \
    jsk-rviz-plugins \
    libuvc \
    nodelet \
    pcl-ros \
    pluginlib \
    rgbd-launch \
    roscpp \
    rqt-reconfigure \
    rviz \
    sensor-msgs \
    tf \
    tf-conversions \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/cis_camera-release/archive/release/melodic/cis_camera/0.0.4-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cis_camera"
SRC_URI = "git://github.com/tork-a/cis_camera-release;${ROS_BRANCH};protocol=https"
SRCREV = "db5251a30a73f81812bd69de6709cd2f94163758"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}